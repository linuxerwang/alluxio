/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.extension.command;


import org.apache.commons.cli.CommandLine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.concurrent.ThreadSafe;

/**
 * Uninstall an extension.
 */
@ThreadSafe
public final class UninstallCommand extends AbstractExtensionCommand {
  private static final Logger LOG = LoggerFactory.getLogger(UninstallCommand.class);

  public UninstallCommand() {}

  @Override
  public String getCommandName() {
    return "uninstall";
  }

  protected int getNumOfArgs() {
    return 1;
  }

  @Override
  public String getUsage() {
    return "uninstall <URI>";
  }

  @Override
  public String getDescription() {
    return "Uninstalls an extension.";
  }

  @Override
  public int run(CommandLine cl) {
    return 0;
  }

  @Override
  public boolean validateArgs(String... args) {
    return args.length == 1 && args[0].endsWith(EXTENSION_JAR);
  }
}