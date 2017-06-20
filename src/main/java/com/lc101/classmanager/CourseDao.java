/**
 * Created by Andrew Bell 6/19/17
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2017. See license.txt for details.
 */

package com.lc101.classmanager;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface CourseDao extends CrudRepository<CourseEntity, Integer> {


}
