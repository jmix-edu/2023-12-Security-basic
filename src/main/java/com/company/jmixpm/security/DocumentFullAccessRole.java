package com.company.jmixpm.security;

import com.company.jmixpm.entity.Document;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

@ResourceRole(name = "DocumentFullAccessRole", code = DocumentFullAccessRole.CODE, scope = "UI")
public interface DocumentFullAccessRole {
    String CODE = "document-full-access-role";

    @MenuPolicy(menuIds = "Document.browse")
    @ScreenPolicy(screenIds = {"Document.browse", "Document.edit"})
    void screens();

    @EntityAttributePolicy(entityClass = Document.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Document.class, actions = EntityPolicyAction.ALL)
    void document();
}