package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new dev.sandeepsuman.mvvm.DataBinderMapperImpl());
  }
}
