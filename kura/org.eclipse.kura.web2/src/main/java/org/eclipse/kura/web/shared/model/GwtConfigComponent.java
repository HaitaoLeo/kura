/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.kura.web.shared.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.kura.web.client.util.KuraBaseModel;

public class GwtConfigComponent extends KuraBaseModel implements Serializable {

    private static final long serialVersionUID = -6388356998309026758L;

    private List<GwtConfigParameter> m_parameters;

    public GwtConfigComponent() {
        this.m_parameters = new ArrayList<GwtConfigParameter>();
    }

    public String getComponentDescription() {
        return this.get("componentDescription");
    }

    public String getComponentIcon() {
        return this.get("componentIcon");
    }

    public String getComponentId() {
        return this.get("componentId");
    }

    public String getComponentName() {
        return this.get("componentName");
    }

    public String getFactoryId() {
        return this.get("factoryPid");
    }

    public GwtConfigParameter getParameter(final String id) {
        for (final GwtConfigParameter param : this.m_parameters) {
            if (param.getId().equals(id)) {
                return param;
            }
        }
        return null;
    }

    public List<GwtConfigParameter> getParameters() {
        return this.m_parameters;
    }

    public boolean isFactoryComponent() {
        return this.get("factoryComponent");
    }

    public boolean isWireComponent() {
        return this.get("isWireComponent");
    }

    public void setComponentDescription(final String componentDescription) {
        this.set("componentDescription", componentDescription);
    }

    public void setComponentIcon(final String componentIcon) {
        this.set("componentIcon", componentIcon);
    }

    public void setComponentId(final String componentId) {
        this.set("componentId", componentId);
    }

    public void setComponentName(final String componentName) {
        this.set("componentName", componentName);
    }

    public void setFactoryComponent(final boolean isFactory) {
        this.set("factoryComponent", isFactory);
    }

    public void setFactoryPid(final String factoryPid) {
        this.set("factoryPid", factoryPid);
    }

    public void setParameters(final List<GwtConfigParameter> parameters) {
        this.m_parameters = parameters;
    }

    public void setWireComponent(final boolean isWireComponent) {
        this.set("isWireComponent", isWireComponent);
    }
}
