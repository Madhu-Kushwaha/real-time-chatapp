package com.substring.chat.repositories;

import com.substring.chat.entitites.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room, String> {
    //custom method: get room using room id
    Room findByRoomId(String roomId);
}
