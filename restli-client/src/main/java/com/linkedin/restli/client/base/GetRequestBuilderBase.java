/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

/**
 * $Id: $
 */

package com.linkedin.restli.client.base;

import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.restli.client.GetRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.common.ResourceSpec;


/**
 * @author Josh Walker
 * @version $Revision: $
 */

public abstract class GetRequestBuilderBase<
        K,
        V extends RecordTemplate,
        RB extends GetRequestBuilderBase<K, V, RB>>
        extends GetRequestBuilder<K, V>
{
  @Deprecated
  protected GetRequestBuilderBase(String baseUriTemplate, Class<V> elementClass, ResourceSpec resourceSpec)
  {
    this(baseUriTemplate, elementClass, resourceSpec, RestliRequestOptions.DEFAULT_OPTIONS);
  }

  protected GetRequestBuilderBase(String baseUriTemplate,
                                  Class<V> elementClass,
                                  ResourceSpec resourceSpec,
                                  RestliRequestOptions requestOptions)
  {
    super(baseUriTemplate, elementClass, resourceSpec, requestOptions);
  }

  @SuppressWarnings({"unchecked"})
  @Override
  public RB id(K id)
  {
    return (RB) super.id(id);
  }

  /**
   * @deprecated This method is deprecated and replaced by a set* method for API consistency reasons.
   * This method cannot be removed permanently until all projects use a version of Rest.li containing the
   * set* methods in a multi-project build environment for binary compatibility.
   */
  @SuppressWarnings({"unchecked"})
  @Deprecated
  @Override
  public RB header(String key, String value)
  {
    return (RB) super.header(key, value);
  }

  @SuppressWarnings({"unchecked"})
  @Override
  public RB setHeader(String key, String value)
  {
    return (RB) super.setHeader(key, value);
  }

  @SuppressWarnings({"unchecked"})
  @Override
  public RB setParam(String key, Object value)
  {
    return (RB) super.setParam(key, value);
  }

  @SuppressWarnings({"unchecked"})
  @Override
  public RB setReqParam(String key, Object value)
  {
    return (RB) super.setReqParam(key, value);
  }

  @SuppressWarnings({"unchecked"})
  @Override
  public RB addParam(String key, Object value)
  {
    return (RB) super.addParam(key, value);
  }

  @SuppressWarnings({"unchecked"})
  @Override
  public RB addReqParam(String key, Object value)
  {
    return (RB) super.addReqParam(key, value);
  }

  @SuppressWarnings({"unchecked"})
  @Override
  public RB pathKey(String name, Object value)
  {
    return (RB) super.pathKey(name, value);
  }

  @SuppressWarnings({"unchecked"})
  @Override
  public RB fields(PathSpec... fieldPaths)
  {
    return (RB) super.fields(fieldPaths);
  }
}
