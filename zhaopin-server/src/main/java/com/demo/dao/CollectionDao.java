package com.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.*;


@Repository
public class CollectionDao extends BaseDao<Collection>{

	@Override
	public Class<Collection> getEntityClass() {
		// TODO Auto-generated method stub
		return Collection.class;
	}
	
	public List<Collection> getCollections(Collection c){
		String sn=getIbatisMapperNamespace() + ".getCollections";
		return getSqlSessionTemplate().selectList(sn, c);
	}
	
	public boolean deleteCollection(Collection c){
		String sn=getIbatisMapperNamespace() + ".deleteCollection";
		return getSqlSessionTemplate().delete(sn, c)==1?true:false;
	}
	
	public boolean addCollection(Collection c){
		String sn=getIbatisMapperNamespace() + ".addCollection";
		return getSqlSessionTemplate().insert(sn, c)==1?true:false;
	}
}
