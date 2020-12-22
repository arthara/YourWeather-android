package com.kimi.tenki.shared.session;

public interface SessionRepository<T> {
    public final String SHARED_PREFERENCE_NAME = "SessionSharedPreferences";

    T getSessionData();
}
