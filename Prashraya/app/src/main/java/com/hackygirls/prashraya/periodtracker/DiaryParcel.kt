package com.hackygirls.prashraya.periodtracker

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.time.LocalDate

@Parcelize
data class DiaryParcel(val date: LocalDate, val diary: String?) : Parcelable {
}
