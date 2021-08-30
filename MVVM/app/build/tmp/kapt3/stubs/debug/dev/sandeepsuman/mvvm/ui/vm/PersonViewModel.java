package dev.sandeepsuman.mvvm.ui.vm;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ldev/sandeepsuman/mvvm/ui/vm/PersonViewModel;", "Landroidx/lifecycle/ViewModel;", "personRepo", "Ldev/sandeepsuman/mvvm/data/repo/PersonRepo;", "(Ldev/sandeepsuman/mvvm/data/repo/PersonRepo;)V", "TAG", "", "kotlin.jvm.PlatformType", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Ldev/sandeepsuman/mvvm/data/model/Response;", "getPerson", "", "getPersonList", "app_debug"})
public final class PersonViewModel extends androidx.lifecycle.ViewModel {
    private final dev.sandeepsuman.mvvm.data.repo.PersonRepo personRepo = null;
    private final java.lang.String TAG = null;
    private final androidx.lifecycle.MutableLiveData<dev.sandeepsuman.mvvm.data.model.Response> liveData = null;
    
    @javax.inject.Inject()
    public PersonViewModel(@org.jetbrains.annotations.NotNull()
    dev.sandeepsuman.mvvm.data.repo.PersonRepo personRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<dev.sandeepsuman.mvvm.data.model.Response> getPersonList() {
        return null;
    }
    
    public final void getPerson() {
    }
}