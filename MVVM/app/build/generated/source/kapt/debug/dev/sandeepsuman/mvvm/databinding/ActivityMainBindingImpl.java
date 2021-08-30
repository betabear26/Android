package dev.sandeepsuman.mvvm.databinding;
import dev.sandeepsuman.mvvm.R;
import dev.sandeepsuman.mvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 32);
        sViewsWithIds.put(R.id.detailsLayout, 33);
        sViewsWithIds.put(R.id.imageView, 34);
        sViewsWithIds.put(R.id.educationTitle, 35);
        sViewsWithIds.put(R.id.marriageTitle, 36);
        sViewsWithIds.put(R.id.onlineTitle, 37);
        sViewsWithIds.put(R.id.personalTitle, 38);
        sViewsWithIds.put(R.id.workTitle, 39);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 40, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[28]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[37]
            , (android.widget.TextView) bindings[38]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[31]
            , (android.widget.ScrollView) bindings[32]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[39]
            );
        this.age.setTag(null);
        this.blood.setTag(null);
        this.born.setTag(null);
        this.bornPlace.setTag(null);
        this.cellphone.setTag(null);
        this.cert.setTag(null);
        this.children.setTag(null);
        this.countryCode.setTag(null);
        this.email.setTag(null);
        this.eyeColor.setTag(null);
        this.fatherName.setTag(null);
        this.gender.setTag(null);
        this.height.setTag(null);
        this.insurance.setTag(null);
        this.ip4.setTag(null);
        this.ip6.setTag(null);
        this.lastName.setTag(null);
        this.married.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.nationalCode.setTag(null);
        this.position.setTag(null);
        this.pwd.setTag(null);
        this.pwdmd5.setTag(null);
        this.religion.setTag(null);
        this.salary.setTag(null);
        this.spouseName.setTag(null);
        this.systemId.setTag(null);
        this.uni.setTag(null);
        this.userAgent.setTag(null);
        this.username.setTag(null);
        this.weight.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.person == variableId) {
            setPerson((dev.sandeepsuman.mvvm.data.model.Person) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPerson(@Nullable dev.sandeepsuman.mvvm.data.model.Person Person) {
        this.mPerson = Person;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.person);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String stringValueOfPersonWorkInsurance = null;
        java.lang.String personEducationUniversity = null;
        java.lang.String personPersonalGender = null;
        boolean personWorkInsurance = false;
        java.lang.String personOnlineInfoUsername = null;
        java.lang.String personPersonalReligion = null;
        java.lang.String personPersonalBornPlace = null;
        java.lang.String personWorkCountryCode = null;
        java.lang.String personWorkSalary = null;
        java.lang.String personMarriageSpouseName = null;
        java.lang.String personPersonalNationalCode = null;
        java.lang.String stringValueOfPersonMarriageMarried = null;
        java.lang.String personPersonalCellphone = null;
        java.lang.String personPersonalHeight = null;
        java.lang.String personEducationCertificate = null;
        java.lang.String personPersonalEyeColor = null;
        java.lang.String personOnlineInfoEmail = null;
        java.lang.String personOnlineInfoIpAddress = null;
        java.lang.String personWorkPosition = null;
        dev.sandeepsuman.mvvm.data.model.Work personWork = null;
        dev.sandeepsuman.mvvm.data.model.Education personEducation = null;
        java.lang.String personOnlineInfoPassword = null;
        dev.sandeepsuman.mvvm.data.model.Personal personPersonal = null;
        java.lang.String stringValueOfPersonMarriageChildren = null;
        int personPersonalAge = 0;
        dev.sandeepsuman.mvvm.data.model.Marriage personMarriage = null;
        java.lang.String stringValueOfPersonPersonalAge = null;
        java.lang.String stringValueOfPersonPersonalGender = null;
        java.lang.String stringValueOfPersonPersonalWeight = null;
        java.lang.String stringValueOfPersonPersonalBorn = null;
        java.lang.String personPersonalFatherName = null;
        boolean personMarriageMarried = false;
        java.lang.String personOnlineInfoIpv6Address = null;
        int personPersonalWeight = 0;
        java.lang.String personPersonalBlood = null;
        java.lang.String personPersonalLastName = null;
        java.lang.String personPersonalName = null;
        int personMarriageChildren = 0;
        java.lang.String personOnlineInfoPasswordMd5 = null;
        java.lang.String personPersonalSystemId = null;
        dev.sandeepsuman.mvvm.data.model.OnlineInfo personOnlineInfo = null;
        dev.sandeepsuman.mvvm.data.model.Person person = mPerson;
        java.lang.String personOnlineInfoUserAgent = null;
        java.lang.Object personPersonalBorn = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (person != null) {
                    // read person.work
                    personWork = person.getWork();
                    // read person.education
                    personEducation = person.getEducation();
                    // read person.personal
                    personPersonal = person.getPersonal();
                    // read person.marriage
                    personMarriage = person.getMarriage();
                    // read person.online_info
                    personOnlineInfo = person.getOnline_info();
                }


                if (personWork != null) {
                    // read person.work.insurance
                    personWorkInsurance = personWork.getInsurance();
                    // read person.work.country_code
                    personWorkCountryCode = personWork.getCountry_code();
                    // read person.work.salary
                    personWorkSalary = personWork.getSalary();
                    // read person.work.position
                    personWorkPosition = personWork.getPosition();
                }
                if (personEducation != null) {
                    // read person.education.university
                    personEducationUniversity = personEducation.getUniversity();
                    // read person.education.certificate
                    personEducationCertificate = personEducation.getCertificate();
                }
                if (personPersonal != null) {
                    // read person.personal.gender
                    personPersonalGender = personPersonal.getGender();
                    // read person.personal.religion
                    personPersonalReligion = personPersonal.getReligion();
                    // read person.personal.born_place
                    personPersonalBornPlace = personPersonal.getBorn_place();
                    // read person.personal.national_code
                    personPersonalNationalCode = personPersonal.getNational_code();
                    // read person.personal.cellphone
                    personPersonalCellphone = personPersonal.getCellphone();
                    // read person.personal.height
                    personPersonalHeight = personPersonal.getHeight();
                    // read person.personal.eye_color
                    personPersonalEyeColor = personPersonal.getEye_color();
                    // read person.personal.age
                    personPersonalAge = personPersonal.getAge();
                    // read person.personal.father_name
                    personPersonalFatherName = personPersonal.getFather_name();
                    // read person.personal.weight
                    personPersonalWeight = personPersonal.getWeight();
                    // read person.personal.blood
                    personPersonalBlood = personPersonal.getBlood();
                    // read person.personal.last_name
                    personPersonalLastName = personPersonal.getLast_name();
                    // read person.personal.name
                    personPersonalName = personPersonal.getName();
                    // read person.personal.system_id
                    personPersonalSystemId = personPersonal.getSystem_id();
                    // read person.personal.born
                    personPersonalBorn = personPersonal.getBorn();
                }
                if (personMarriage != null) {
                    // read person.marriage.spouse_name
                    personMarriageSpouseName = personMarriage.getSpouse_name();
                    // read person.marriage.married
                    personMarriageMarried = personMarriage.getMarried();
                    // read person.marriage.children
                    personMarriageChildren = personMarriage.getChildren();
                }
                if (personOnlineInfo != null) {
                    // read person.online_info.username
                    personOnlineInfoUsername = personOnlineInfo.getUsername();
                    // read person.online_info.email
                    personOnlineInfoEmail = personOnlineInfo.getEmail();
                    // read person.online_info.ip_address
                    personOnlineInfoIpAddress = personOnlineInfo.getIp_address();
                    // read person.online_info.password
                    personOnlineInfoPassword = personOnlineInfo.getPassword();
                    // read person.online_info.ipv6_address
                    personOnlineInfoIpv6Address = personOnlineInfo.getIpv6_address();
                    // read person.online_info.password_md5
                    personOnlineInfoPasswordMd5 = personOnlineInfo.getPassword_md5();
                    // read person.online_info.user_agent
                    personOnlineInfoUserAgent = personOnlineInfo.getUser_agent();
                }


                // read String.valueOf(person.work.insurance)
                stringValueOfPersonWorkInsurance = java.lang.String.valueOf(personWorkInsurance);
                // read String.valueOf(person.personal.gender)
                stringValueOfPersonPersonalGender = java.lang.String.valueOf(personPersonalGender);
                // read String.valueOf(person.personal.age)
                stringValueOfPersonPersonalAge = java.lang.String.valueOf(personPersonalAge);
                // read String.valueOf(person.personal.weight)
                stringValueOfPersonPersonalWeight = java.lang.String.valueOf(personPersonalWeight);
                // read String.valueOf(person.personal.born)
                stringValueOfPersonPersonalBorn = java.lang.String.valueOf(personPersonalBorn);
                // read String.valueOf(person.marriage.married)
                stringValueOfPersonMarriageMarried = java.lang.String.valueOf(personMarriageMarried);
                // read String.valueOf(person.marriage.children)
                stringValueOfPersonMarriageChildren = java.lang.String.valueOf(personMarriageChildren);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.age, stringValueOfPersonPersonalAge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.blood, personPersonalBlood);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.born, stringValueOfPersonPersonalBorn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bornPlace, personPersonalBornPlace);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cellphone, personPersonalCellphone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cert, personEducationCertificate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.children, stringValueOfPersonMarriageChildren);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryCode, personWorkCountryCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.email, personOnlineInfoEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.eyeColor, personPersonalEyeColor);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fatherName, personPersonalFatherName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gender, stringValueOfPersonPersonalGender);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.height, personPersonalHeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.insurance, stringValueOfPersonWorkInsurance);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ip4, personOnlineInfoIpAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ip6, personOnlineInfoIpv6Address);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lastName, personPersonalLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.married, stringValueOfPersonMarriageMarried);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, personPersonalName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nationalCode, personPersonalNationalCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.position, personWorkPosition);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pwd, personOnlineInfoPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pwdmd5, personOnlineInfoPasswordMd5);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.religion, personPersonalReligion);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.salary, personWorkSalary);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.spouseName, personMarriageSpouseName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.systemId, personPersonalSystemId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.uni, personEducationUniversity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userAgent, personOnlineInfoUserAgent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.username, personOnlineInfoUsername);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.weight, stringValueOfPersonPersonalWeight);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): person
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}