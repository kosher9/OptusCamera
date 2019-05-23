package com.github.kosher9.lastoptus.camera

/*
open class Size(var width: Int, var height: Int): Comparable<Size> {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Size

        if (width != other.width) return false
        if (height != other.height) return false

        return true
    }

    override fun hashCode(): Int {
        return height xor (width shl Integer.SIZE / 2 or width.ushr(Integer.SIZE / 2))
    }

    override fun toString(): String = "$width x $height"

    override fun compareTo(other: Size): Int {
        return width * height - other.width * other.height
    }
}*/
