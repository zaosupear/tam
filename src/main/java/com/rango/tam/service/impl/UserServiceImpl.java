package com.rango.tam.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rango.tam.entity.User;
import com.rango.tam.mapper.UserMapper;
import com.rango.tam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author rango
 * @description
 * @date 2020-12-27 23:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean save(User entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<User> entityList) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean removeById(Serializable id) {
        return false;
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return false;
    }

    @Override
    public boolean remove(Wrapper<User> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(User entity) {
        return false;
    }

    @Override
    public boolean update(Wrapper<User> updateWrapper) {
        return false;
    }

    @Override
    public boolean update(User entity, Wrapper<User> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(User entity) {
        return false;
    }

    @Override
    public User getById(Serializable id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public List<User> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public User getOne(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public User getOne(Wrapper<User> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int count(Wrapper<User> queryWrapper) {
        return 0;
    }

    @Override
    public List<User> list(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public <E extends IPage<User>> E page(E page, Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <E extends IPage<User>> E page(E page) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return null;
    }

    @Override
    public List<Object> listObjs() {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public List<Object> listObjs(Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<User> queryWrapper) {
        return null;
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return null;
    }

    @Override
    public BaseMapper<User> getBaseMapper() {
        return null;
    }

    @Override
    public Class<User> getEntityClass() {
        return null;
    }

    @Override
    public QueryChainWrapper<User> query() {
        return null;
    }

    @Override
    public LambdaQueryChainWrapper<User> lambdaQuery() {
        return null;
    }

    @Override
    public KtQueryChainWrapper<User> ktQuery() {
        return null;
    }

    @Override
    public KtUpdateChainWrapper<User> ktUpdate() {
        return null;
    }

    @Override
    public UpdateChainWrapper<User> update() {
        return null;
    }

    @Override
    public LambdaUpdateChainWrapper<User> lambdaUpdate() {
        return null;
    }

    @Override
    public boolean saveOrUpdate(User entity, Wrapper<User> updateWrapper) {
        return false;
    }
}
