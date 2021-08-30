package dev.sandeepsuman.mvvm.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Ldev/sandeepsuman/mvvm/util/UiState;", "", "StateError", "StateLoading", "StateSuccess", "Ldev/sandeepsuman/mvvm/util/UiState$StateSuccess;", "Ldev/sandeepsuman/mvvm/util/UiState$StateError;", "Ldev/sandeepsuman/mvvm/util/UiState$StateLoading;", "app_debug"})
public abstract interface UiState {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/sandeepsuman/mvvm/util/UiState$StateSuccess;", "Ldev/sandeepsuman/mvvm/util/UiState;", "()V", "app_debug"})
    public static final class StateSuccess implements dev.sandeepsuman.mvvm.util.UiState {
        @org.jetbrains.annotations.NotNull()
        public static final dev.sandeepsuman.mvvm.util.UiState.StateSuccess INSTANCE = null;
        
        private StateSuccess() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/sandeepsuman/mvvm/util/UiState$StateError;", "Ldev/sandeepsuman/mvvm/util/UiState;", "()V", "app_debug"})
    public static final class StateError implements dev.sandeepsuman.mvvm.util.UiState {
        @org.jetbrains.annotations.NotNull()
        public static final dev.sandeepsuman.mvvm.util.UiState.StateError INSTANCE = null;
        
        private StateError() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldev/sandeepsuman/mvvm/util/UiState$StateLoading;", "Ldev/sandeepsuman/mvvm/util/UiState;", "()V", "app_debug"})
    public static final class StateLoading implements dev.sandeepsuman.mvvm.util.UiState {
        @org.jetbrains.annotations.NotNull()
        public static final dev.sandeepsuman.mvvm.util.UiState.StateLoading INSTANCE = null;
        
        private StateLoading() {
            super();
        }
    }
}