/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ActivitySucceededEventDetails"
 *      target="_top">AWS API Documentation</a>
 */
public class ActivitySucceededEventDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON data output by the activity task.
     * </p>
     */
    private String output;

    /**
     * <p>
     * The JSON data output by the activity task.
     * </p>
     * 
     * @param output
     *        The JSON data output by the activity task.
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The JSON data output by the activity task.
     * </p>
     * 
     * @return The JSON data output by the activity task.
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The JSON data output by the activity task.
     * </p>
     * 
     * @param output
     *        The JSON data output by the activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivitySucceededEventDetails withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivitySucceededEventDetails == false)
            return false;
        ActivitySucceededEventDetails other = (ActivitySucceededEventDetails) obj;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public ActivitySucceededEventDetails clone() {
        try {
            return (ActivitySucceededEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
