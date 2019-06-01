package com.gary.organization.api.service;

import com.gary.organization.api.entity.Organization;

/**
 * Created by Gary on 2019-06-01.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-01
 * @since 0.0.1
 */
public interface IOrganizationService {
    Organization find(long id);
}
