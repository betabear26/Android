// Generated by data binding compiler. Do not edit!
package dev.sandeepsuman.mvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import dev.sandeepsuman.mvvm.R;
import dev.sandeepsuman.mvvm.data.model.Person;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final TextView age;

  @NonNull
  public final TextView blood;

  @NonNull
  public final TextView born;

  @NonNull
  public final TextView bornPlace;

  @NonNull
  public final TextView cellphone;

  @NonNull
  public final TextView cert;

  @NonNull
  public final TextView children;

  @NonNull
  public final TextView countryCode;

  @NonNull
  public final LinearLayout detailsLayout;

  @NonNull
  public final TextView educationTitle;

  @NonNull
  public final TextView email;

  @NonNull
  public final TextView eyeColor;

  @NonNull
  public final TextView fatherName;

  @NonNull
  public final TextView gender;

  @NonNull
  public final TextView height;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView insurance;

  @NonNull
  public final TextView ip4;

  @NonNull
  public final TextView ip6;

  @NonNull
  public final TextView lastName;

  @NonNull
  public final TextView marriageTitle;

  @NonNull
  public final TextView married;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView nationalCode;

  @NonNull
  public final TextView onlineTitle;

  @NonNull
  public final TextView personalTitle;

  @NonNull
  public final TextView position;

  @NonNull
  public final TextView pwd;

  @NonNull
  public final TextView pwdmd5;

  @NonNull
  public final TextView religion;

  @NonNull
  public final TextView salary;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final TextView spouseName;

  @NonNull
  public final TextView systemId;

  @NonNull
  public final TextView uni;

  @NonNull
  public final TextView userAgent;

  @NonNull
  public final TextView username;

  @NonNull
  public final TextView weight;

  @NonNull
  public final TextView workTitle;

  @Bindable
  protected Person mPerson;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView age, TextView blood, TextView born, TextView bornPlace, TextView cellphone,
      TextView cert, TextView children, TextView countryCode, LinearLayout detailsLayout,
      TextView educationTitle, TextView email, TextView eyeColor, TextView fatherName,
      TextView gender, TextView height, ImageView imageView, TextView insurance, TextView ip4,
      TextView ip6, TextView lastName, TextView marriageTitle, TextView married, TextView name,
      TextView nationalCode, TextView onlineTitle, TextView personalTitle, TextView position,
      TextView pwd, TextView pwdmd5, TextView religion, TextView salary, ScrollView scrollView,
      TextView spouseName, TextView systemId, TextView uni, TextView userAgent, TextView username,
      TextView weight, TextView workTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.age = age;
    this.blood = blood;
    this.born = born;
    this.bornPlace = bornPlace;
    this.cellphone = cellphone;
    this.cert = cert;
    this.children = children;
    this.countryCode = countryCode;
    this.detailsLayout = detailsLayout;
    this.educationTitle = educationTitle;
    this.email = email;
    this.eyeColor = eyeColor;
    this.fatherName = fatherName;
    this.gender = gender;
    this.height = height;
    this.imageView = imageView;
    this.insurance = insurance;
    this.ip4 = ip4;
    this.ip6 = ip6;
    this.lastName = lastName;
    this.marriageTitle = marriageTitle;
    this.married = married;
    this.name = name;
    this.nationalCode = nationalCode;
    this.onlineTitle = onlineTitle;
    this.personalTitle = personalTitle;
    this.position = position;
    this.pwd = pwd;
    this.pwdmd5 = pwdmd5;
    this.religion = religion;
    this.salary = salary;
    this.scrollView = scrollView;
    this.spouseName = spouseName;
    this.systemId = systemId;
    this.uni = uni;
    this.userAgent = userAgent;
    this.username = username;
    this.weight = weight;
    this.workTitle = workTitle;
  }

  public abstract void setPerson(@Nullable Person person);

  @Nullable
  public Person getPerson() {
    return mPerson;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
