package com.wanmeizhensuo.zhensuo.utils.imageLoader

import android.graphics.Bitmap
import com.bumptech.glide.integration.webp.decoder.WebpDrawable
import com.bumptech.glide.integration.webp.decoder.WebpDrawableTransformation
import com.bumptech.glide.load.Transformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.zss.library.imageLoader.GlideApp

/**
 * Glide图片加载策略
 */
class GlideImageLoadPolicy : ImageLoadPolicy {
    override fun loadImage(options: ImageOptions) {
        var newWidth = options.width
        var newHeight = options.height
        if (options.width == 0) {
            newWidth = options.imageView.width
        }
        if (options.height == 0) {
            newHeight = options.imageView.height
        }
        GlideApp.with(options.context)
            .asBitmap()
            .load(options.url)
            .diskCacheStrategy(DiskCacheStrategy.DATA)
            .centerCrop()
            .override(newWidth, newHeight)
            .placeholder(options.placeholder)
            .error(options.error)
            .into(options.imageView)
    }

    override fun loadImageIntoTarget(options: ImageOptions) {
        if (options.target == null) return
        var newWidth = options.width
        var newHeight = options.height
        if (options.width == 0) {
            newWidth = options.imageView.width
        }
        if (options.height == 0) {
            newHeight = options.imageView.height
        }
        GlideApp.with(options.context)
            .asBitmap()
            .load(options.url)
            .diskCacheStrategy(DiskCacheStrategy.DATA)
            .centerCrop()
            .override(newWidth, newHeight)
            .placeholder(options.placeholder)
            .error(options.error)
            .into(options.target)
    }

    override fun loadCircleImage(options: ImageOptions) {
        var newWidth = options.width
        var newHeight = options.height
        if (options.width == 0) {
            newWidth = options.imageView.width
        }
        if (options.height == 0) {
            newHeight = options.imageView.height
        }
        val requestOptions = RequestOptions.circleCropTransform()
        GlideApp.with(options.context)
            .asBitmap()
            .load(options.url)
            .diskCacheStrategy(DiskCacheStrategy.DATA)
            .centerCrop()
            .apply(requestOptions)
            .override(newWidth, newHeight)
            .placeholder(options.placeholder)
            .error(options.error)
            .into(options.imageView)
    }

    override fun loadRoundImage(options: ImageOptions) {
        var newWidth = options.width
        var newHeight = options.height
        if (options.width == 0) {
            newWidth = options.imageView.width
        }
        if (options.height == 0) {
            newHeight = options.imageView.height
        }
        GlideApp.with(options.context)
            .asBitmap()
            .load(options.url)
            .diskCacheStrategy(DiskCacheStrategy.DATA)
            .apply(RequestOptions.bitmapTransform(RoundedCorners(options.corner)))
            .override(newWidth, newHeight)
            .placeholder(options.placeholder)
            .error(options.error)
            .into(options.imageView)
    }

    override fun loadGifImage(options: ImageOptions) {
        var newWidth = options.width
        var newHeight = options.height
        if (options.width == 0) {
            newWidth = options.imageView.width
        }
        if (options.height == 0) {
            newHeight = options.imageView.height
        }
        GlideApp.with(options.context)
            .asGif()
            .load(options.url)
            .centerCrop()
            .override(newWidth, newHeight)
            .placeholder(options.placeholder)
            .error(options.error)
            .into(options.imageView)
    }

    override fun loadWebpImage(options: ImageOptions) {
        var newWidth = options.width
        var newHeight = options.height
        if (options.width == 0) {
            newWidth = options.imageView.width
        }
        if (options.height == 0) {
            newHeight = options.imageView.height
        }
        val centerCrop: Transformation<Bitmap> = CenterCrop()
        GlideApp.with(options.context)
            .load(options.url)
            .override(newWidth, newHeight)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .optionalTransform(centerCrop)
            .optionalTransform(WebpDrawable::class.java, WebpDrawableTransformation(centerCrop))
            .into(options.imageView)
    }

}