//
// Created by 沈彬 on 17/7/15.
//

#ifndef FRAMEWORKS_LOG_H
#define FRAMEWORKS_LOG_H

#include <android/log.h>

#define ALOGV(...) __android_log_print(ANDROID_LOG_VERBOSE,"andnux",__VA_ARGS__)
#define ALOGD(...) __android_log_print(ANDROID_LOG_DEBUG,"andnux",__VA_ARGS__)
#define ALOGI(...) __android_log_print(ANDROID_LOG_INFO,"andnux",__VA_ARGS__)
#define ALOGW(...) __android_log_print(ANDROID_LOG_WARN,"andnux",__VA_ARGS__)
#define ALOGE(...) __android_log_print(ANDROID_LOG_ERROR,"andnux",__VA_ARGS__)

#define ALOGVT(tag,...) __android_log_print(ANDROID_LOG_VERBOSE,tag,__VA_ARGS__)
#define ALOGDT(tag,...) __android_log_print(ANDROID_LOG_DEBUG,tag,__VA_ARGS__)
#define ALOGIT(tag,...) __android_log_print(ANDROID_LOG_INFO,tag,__VA_ARGS__)
#define ALOGWT(tag,...) __android_log_print(ANDROID_LOG_WARN,tag,__VA_ARGS__)
#define ALOGET(tag,...) __android_log_print(ANDROID_LOG_ERROR,tag,__VA_ARGS__)

#endif //FRAMEWORKS_LOG_H
