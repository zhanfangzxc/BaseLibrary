package com.wanmeizhensuo.zhensuo.utils.imageLoader

/**
 * @author zhaoshanshan
 * 加载图片策略，如果需要更换图片加载库，只需要实现该类，然后用新的图片加载库来实现功能即可
 */
interface ImageLoadPolicy {
    /**
     * 加载图片
     */
    fun loadImage(options: ImageOptions)

    /**
     * 加载图片到target中
     */
    fun loadImageIntoTarget(options: ImageOptions)

    /**
     * 加载圆形图片
     */
    fun loadCircleImage(options: ImageOptions)

    /**
     * 加载圆角图片
     */
    fun loadRoundImage(options: ImageOptions)

    /**
     * 加载GIF图片
     */
    fun loadGifImage(options: ImageOptions)

    /**
     * 加载Webp
     */
    fun loadWebpImage(options: ImageOptions)

}