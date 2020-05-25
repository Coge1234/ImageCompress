package com.jochen.library.listener;

import com.jochen.library.bean.Photo;

import java.util.ArrayList;

/**
 * Created by JoChen on 2020/5/25.
 * 图片集合的压缩返回监听
 */
public interface CompressImage {
    // 开始压缩
    void compress();

    // 图片集合的压缩结果返回
    interface CompressListener {

        // 成功
        void onCompressSuccess(ArrayList<Photo> images);

        // 失败
        void onCompressFailed(ArrayList<Photo> images, String error);
    }
}
