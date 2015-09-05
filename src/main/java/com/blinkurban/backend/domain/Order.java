package com.blinkurban.backend.domain;

import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Order{
	@Id private long id;
	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	Key<User> user;
	
	public Order(){}
	
}