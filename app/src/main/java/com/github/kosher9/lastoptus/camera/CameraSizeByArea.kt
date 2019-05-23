package com.github.kosher9.lastoptus.camera

import android.util.Size
import java.lang.Long.signum

internal class CompareSizesByArea : Comparator<android.util.Size> {

    // We cast here to ensure the multiplications won't overflow
    override fun compare(o1: Size, o2: Size): Int =
        signum(o1.width.toLong() * o1.height - o2.width.toLong() * o2.height)

}