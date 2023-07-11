package com.example.meetingdemo.entity.request;

import lombok.Data;

/**
 * @createTime 2023年07月10日
 */
@Data
public class RecordParam {
    private String streamURL;
    private String save_file;
    private int audioChannel = 1;
}
