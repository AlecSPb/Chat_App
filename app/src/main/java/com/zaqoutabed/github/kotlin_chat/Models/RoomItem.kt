package com.zaqoutabed.github.kotlin_chat.Models

class RoomItem(roomId:Int, roomName:String, roomImageUrl:String) {
    var roomId:Int
    var roomName:String
    var roomImageUrl:String

    init {
        this.roomId = roomId
        this.roomName = roomName
        this.roomImageUrl = roomImageUrl
    }
}