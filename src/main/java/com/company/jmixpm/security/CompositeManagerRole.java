package com.company.jmixpm.security;

import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.UiMinimalRole;

@ResourceRole(name = "CompositeManagerRole", code = CompositeManagerRole.CODE, scope = "UI")
public interface CompositeManagerRole extends ProjectFullAccessRole, TaskFullAccesssRole,
        DocumentFullAccessRole, UserReadUpdateRole, UiMinimalRole {
    String CODE = "composite-manager-role";
}