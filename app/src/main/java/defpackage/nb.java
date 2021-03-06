package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.amap.bundle.drive.common.dialog.nightmode.widget.NightModeEditText;
import com.autonavi.amap.app.AMapAppGlobal;
import com.autonavi.minimap.R;

/* renamed from: nb reason: default package */
/* compiled from: NightModeEditTextAttrsWrapper */
public final class nb extends my<NightModeEditText> {
    public nb(Context context, AttributeSet attributeSet, int i, NightModeEditText nightModeEditText) {
        super(context, attributeSet, i, nightModeEditText);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, AttributeSet attributeSet, int i) {
        super.a(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.NightMode, i, 0);
        this.b = obtainStyledAttributes.getResourceId(R.styleable.NightMode_dayModeSrc, -1);
        this.c = obtainStyledAttributes.getResourceId(R.styleable.NightMode_nightModeSrc, -1);
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z) {
        super.a(z);
        if (this.b <= 0 || z) {
            if (this.c > 0 && z) {
                ((NightModeEditText) this.a).setTextColor(AMapAppGlobal.getApplication().getResources().getColor(this.c));
            }
            return;
        }
        ((NightModeEditText) this.a).setTextColor(AMapAppGlobal.getApplication().getResources().getColor(this.b));
    }
}
