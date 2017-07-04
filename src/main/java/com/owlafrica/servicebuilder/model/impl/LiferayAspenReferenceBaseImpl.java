package com.owlafrica.servicebuilder.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.owlafrica.servicebuilder.model.LiferayAspenReference;
import com.owlafrica.servicebuilder.service.LiferayAspenReferenceLocalServiceUtil;

/**
 * The extended model base implementation for the LiferayAspenReference service. Represents a row in the &quot;liferay_aspen_reference&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LiferayAspenReferenceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayAspenReferenceImpl
 * @see com.owlafrica.servicebuilder.model.LiferayAspenReference
 * @generated
 */
public abstract class LiferayAspenReferenceBaseImpl
    extends LiferayAspenReferenceModelImpl implements LiferayAspenReference {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a liferay aspen reference model instance should use the {@link LiferayAspenReference} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LiferayAspenReferenceLocalServiceUtil.addLiferayAspenReference(this);
        } else {
            LiferayAspenReferenceLocalServiceUtil.updateLiferayAspenReference(this);
        }
    }
}
