package hello;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
	@Autowired
	private RedisTemplate<String,String> redisTemplate;
	
	public Boolean setIfAbsent (String key, String value, long timeout, TimeUnit timeUnit)
	{
		if(redisTemplate.opsForValue().setIfAbsent(key, value))
		{
			redisTemplate.expire(key, timeout, timeUnit);
			
			return new Boolean (true);
		}
		
		return new Boolean (false);
	}
	
	public Boolean setIfAbsent(String key, String value)
	{
		return redisTemplate.opsForValue().setIfAbsent(key, value);		
	}
	
	
	public void delete (String key)
	{
		redisTemplate.delete(key);		
	}

}
