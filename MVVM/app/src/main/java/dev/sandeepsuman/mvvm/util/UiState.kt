package dev.sandeepsuman.mvvm.util

sealed interface UiState{

    object StateSuccess : UiState
    object StateError: UiState
    object StateLoading: UiState

}
