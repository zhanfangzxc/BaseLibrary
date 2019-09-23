package com.wanmeizhensuo.zhensuo.utils.imageLoader

import android.content.Context
import android.graphics.Bitmap
import android.widget.ImageView
import com.bumptech.glide.request.target.ImageViewTarget

/**
 * @author zhaoshanshan
 * 加载图片所需参数
 */
data class ImageOptions(
        val context: Context,
        val imageView: ImageView,
        val target: ImageViewTarget<Bitmap>? = null,
        val url: String = "",
        val error: Int = 0,
        val placeholder: Int = 0,
        val width: Int = 0,
        val height: Int = 0,
        val corner: Int = 0
) {
    class Builder {

        private lateinit var context: Context
        private lateinit var imageView: ImageView
        private var target: ImageViewTarget<Bitmap>? = null
        private var url: String = ""
        private var error: Int = 0
        private var placeholder: Int = 0
        private var width: Int = 0
        private var height: Int = 0
        private var corner: Int = 0

        fun context(context: Context) = apply { this.context = context }
        fun imageView(imageView: ImageView) = apply { this.imageView = imageView }
        fun target(target: ImageViewTarget<Bitmap>) = apply { this.target = target }
        fun url(url: String) = apply { this.url = url }
        fun error(error: Int) = apply { this.error = error }
        fun placeholder(placeholder: Int) = apply { this.placeholder = placeholder }
        fun width(width: Int) = apply { this.width = width }
        fun height(height: Int) = apply { this.height = height }
        fun corner(corner: Int) = apply { this.corner = corner }

        fun build() = ImageOptions(
                context,
                imageView,
                target,
                url,
                error,
                placeholder,
                width,
                height,
                corner
        )
    }
}