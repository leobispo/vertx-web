/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.groovy.ext.apex.addons;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.groovy.ext.auth.AuthService
/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@CompileStatic
public class RedirectAuthHandler extends AuthHandler {
  final def io.vertx.ext.apex.addons.RedirectAuthHandler delegate;
  public RedirectAuthHandler(io.vertx.ext.apex.addons.RedirectAuthHandler delegate) {
    super(delegate);
    this.delegate = delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public static AuthHandler redirectAuthHandler(AuthService authService) {
    def ret= AuthHandler.FACTORY.apply(io.vertx.ext.apex.addons.RedirectAuthHandler.redirectAuthHandler((io.vertx.ext.auth.AuthService)authService.getDelegate()));
    return ret;
  }
  public static AuthHandler redirectAuthHandler(AuthService authService, String loginRedirectURL) {
    def ret= AuthHandler.FACTORY.apply(io.vertx.ext.apex.addons.RedirectAuthHandler.redirectAuthHandler((io.vertx.ext.auth.AuthService)authService.getDelegate(), loginRedirectURL));
    return ret;
  }
  public static AuthHandler redirectAuthHandler(AuthService authService, String loginRedirectURL, String returnURLParam) {
    def ret= AuthHandler.FACTORY.apply(io.vertx.ext.apex.addons.RedirectAuthHandler.redirectAuthHandler((io.vertx.ext.auth.AuthService)authService.getDelegate(), loginRedirectURL, returnURLParam));
    return ret;
  }

  static final java.util.function.Function<io.vertx.ext.apex.addons.RedirectAuthHandler, RedirectAuthHandler> FACTORY = io.vertx.lang.groovy.Factories.createFactory() {
    io.vertx.ext.apex.addons.RedirectAuthHandler arg -> new RedirectAuthHandler(arg);
  };
}
