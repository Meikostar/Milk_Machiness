/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package apache.mina.core.session;

import apache.mina.util.ExpirationListener;
import apache.mina.util.ExpiringMap;

import java.net.SocketAddress;

/**
 * An {@link IoSessionRecycler} with sessions that time out on inactivity.
 *
 * TODO Document me.
 *
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 * @apache.xbean.XBean
 */
public class ExpiringSessionRecycler implements IoSessionRecycler {
    private ExpiringMap<SocketAddress, IoSession> sessionMap;

    private ExpiringMap<SocketAddress, IoSession>.Expirer mapExpirer;

    public ExpiringSessionRecycler() {
        this(ExpiringMap.DEFAULT_TIME_TO_LIVE);
    }

    public ExpiringSessionRecycler(int timeToLive) {
        this(timeToLive, ExpiringMap.DEFAULT_EXPIRATION_INTERVAL);
    }

    public ExpiringSessionRecycler(int timeToLive, int expirationInterval) {
        sessionMap = new ExpiringMap<SocketAddress, IoSession>(timeToLive, expirationInterval);
        mapExpirer = sessionMap.getExpirer();
        sessionMap.addExpirationListener(new DefaultExpirationListener());
    }

    public void put(IoSession session) {
        mapExpirer.startExpiringIfNotStarted();

        SocketAddress key = session.getRemoteAddress();

        if (!sessionMap.containsKey(key)) {
            sessionMap.put(key, session);
        }
    }

    public IoSession recycle(SocketAddress remoteAddress) {
        return sessionMap.get(remoteAddress);
    }

    public void remove(IoSession session) {
        sessionMap.remove(session.getRemoteAddress());
    }

    public void stopExpiring() {
        mapExpirer.stopExpiring();
    }

    public int getExpirationInterval() {
        return sessionMap.getExpirationInterval();
    }

    public int getTimeToLive() {
        return sessionMap.getTimeToLive();
    }

    public void setExpirationInterval(int expirationInterval) {
        sessionMap.setExpirationInterval(expirationInterval);
    }

    public void setTimeToLive(int timeToLive) {
        sessionMap.setTimeToLive(timeToLive);
    }

    private class DefaultExpirationListener implements ExpirationListener<IoSession> {
        public void expired(IoSession expiredSession) {
            expiredSession.close(true);
        }
    }
}
