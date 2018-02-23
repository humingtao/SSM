package org.malajava.service;

import java.util.List;

import org.malajava.entity.classinfo;

public interface IClassInfoService {
	public classinfo loadById(Integer id);
	
	public List<classinfo> loadAll();

	public int save(classinfo classinfo);
}
