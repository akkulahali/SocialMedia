package com.akkulahali.repository.entity;

import com.akkulahali.repository.entity.Comment;
import com.akkulahali.repository.entity.Like;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILikeRepository extends MongoRepository<Like,String> {
}