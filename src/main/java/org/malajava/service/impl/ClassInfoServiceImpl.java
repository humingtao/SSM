package org.malajava.service.impl;

import java.util.List;

import org.malajava.entity.classinfo;
import org.malajava.mapper.classinfoMapper;
import org.malajava.service.IClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassInfoServiceImpl implements IClassInfoService {

	@Autowired
	private classinfoMapper classinfoMapper;

	@Override
	public classinfo loadById(Integer id) {
		return classinfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<classinfo> loadAll() {

		return classinfoMapper.loadAll();
	}

	@Override
	public int save(classinfo classinfo) {

		return classinfoMapper.insert(classinfo);
	}

}
