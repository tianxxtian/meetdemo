package com.example.meetingdemo.controller;

import com.example.meetingdemo.entity.StreamDTO;
import com.example.meetingdemo.entity.request.RecordParam;
import com.example.meetingdemo.service.RecordService;
import org.springframework.web.bind.annotation.*;

/**
 * @createTime 2023年07月11日
 */
@RestController
@RequestMapping("/api/v1")
public class RecallController {

    public RecordService recordService;

    public RecallController(RecordService recordService) {
        this.recordService = recordService;
    }

    @PostMapping("/publish")
    public int streams(@RequestBody StreamDTO streamDTO) {
        String url = "record stream: rtmp://192.168.107.100/" + streamDTO.getApp() + "/" + streamDTO.getStream();
        System.out.println("stream starts on: " + url);
        return 0;
    }

    @PostMapping("/unpublish")
    public int streams_end(@RequestBody String body){
        System.out.println("stream end     " + body);
        return 0;
    }

    @PostMapping("/play")
    public int play(@RequestBody String body){
        System.out.println("start play     " + body);
        return 0;
    }

    @PostMapping("/stop")
    public int stop(@RequestBody String body){
        System.out.println("end play     " + body);
        return 0;
    }

//    @PostMapping("/record")
//    public int record(@RequestBody RecordParam recordParam){
//        System.out.println("recording request recieved, stream from: " + recordParam.getStreamURL());
//        String output = recordParam.getSave_file() + ".mp4";
//        try {
//            recordService.frameRecord(recordParam.getStreamURL(),  output, recordParam.getAudioChannel());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//
//    @GetMapping("/record")
//    public int record_stop(){
//        recordService.stopRecord();
//        System.out.println("manually stop the record");
//        return 0;
//    }
}
