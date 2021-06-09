package com.redislabs.mesclun.api.sync;

import com.redislabs.mesclun.api.StatefulRedisModulesConnection;
import io.lettuce.core.api.sync.RedisCommands;

public interface RedisModulesCommands<K, V> extends RedisCommands<K, V>, RedisGearsCommands<K, V>, RediSearchCommands<K, V>, RedisTimeSeriesCommands<K, V> {

    @Override
    StatefulRedisModulesConnection<K, V> getStatefulConnection();

}