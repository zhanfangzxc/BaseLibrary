package com.wanmeizhensuo.zhensuo.utils.imageLoader

class ImageLoaderUtils {
    private var imageLoaderProxy: ImageLoadPolicy = GlideImageLoadPolicy()

    companion object {
        @JvmStatic
        val instance: ImageLoaderUtils = ImageLoaderUtils()
    }

    fun loadImage(options: ImageOptions) {
        imageLoaderProxy.loadImage(options)
    }

    fun loadCircleImage(options: ImageOptions) {
        imageLoaderProxy.loadCircleImage(options)
    }

    fun loadRoundImage(options: ImageOptions) {
        imageLoaderProxy.loadRoundImage(options)
    }

    fun loadGifImage(options: ImageOptions) {
        imageLoaderProxy.loadGifImage(options)
    }

    fun loadWebpImage(options: ImageOptions) {
        imageLoaderProxy.loadWebpImage(options)
    }

    fun loadImageIntoTarget(options: ImageOptions) {
        imageLoaderProxy.loadImageIntoTarget(options)
    }
}