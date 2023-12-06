package com.company.jmixpm.security;

import com.company.jmixpm.entity.Task;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

@ResourceRole(name = "TaskFullAccesssRole", code = TaskFullAccesssRole.CODE, scope = "UI")
public interface TaskFullAccesssRole {
    String CODE = "task-full-accesss-role";

    @MenuPolicy(menuIds = "Task_.browse")
    @ScreenPolicy(screenIds = {"Task_.browse", "Task_.edit"})
    void screens();

    @EntityAttributePolicy(entityClass = Task.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Task.class, actions = EntityPolicyAction.ALL)
    void task();
}