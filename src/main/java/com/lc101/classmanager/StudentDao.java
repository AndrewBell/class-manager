package com.lc101.classmanager;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Andrew Bell 6/19/17
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2017. See license.txt for details.
 */
@Service
public interface StudentDao extends CrudRepository<StudentEntity, Integer> {
}
