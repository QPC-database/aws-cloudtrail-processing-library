/*******************************************************************************
 * Copyright (c) 2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *******************************************************************************/
package com.amazonaws.services.cloudtrail.processinglibrary.model.internal;

public class SessionIssuer extends CloudTrailDataStore{
    /**
     * Get session issuer type
     *
     * @return The source of the temporary security credentials, such as "Root", "IAMUser", or "Role"
     */
    public String getType() {
        return (String) this.get(CloudTrailRecordField.type.name());
    }

    /**
     * Get session issuer principal ID
     *
     * @return The internal ID of the entity that was used to get credentials.
     */
    public String getPrincipalId() {
        return (String) this.get(CloudTrailRecordField.principalId.name());
    }

    /**
     * Get session issuer ARN
     *
     * @return The ARN of the source (account, IAM user, or role) that was used to get temporary security credentials.
     */
    public String getArn() {
        return (String) this.get(CloudTrailRecordField.arn.name());
    }

    /**
     * Get session issuer account ID
     *
     * @return The account that owns the entity that was used to get credentials.
     */
    public String getAccountId() {
        return (String) this.get(CloudTrailRecordField.accountId.name());
    }

    /**
     * Get session issuer user name
     *
     * @return The friendly name of the user or role.
     */
    public String getUserName() {
        return (String) this.get(CloudTrailRecordField.userName.name());
    }
}