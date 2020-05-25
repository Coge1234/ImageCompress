package com.jochen.library.listener;

/**
 * Created by JoChen on 2020/5/25.
 * 单张图片压缩时的监听
 */
public interface CompressResultListener {
    // 成功
    void onCompressSuccess(String imgPath);

    // 失败
    void onCompressFailed(String imgPath, String error);
}
