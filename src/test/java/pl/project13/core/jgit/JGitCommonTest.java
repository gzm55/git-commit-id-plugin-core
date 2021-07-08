/*
 * This file is part of git-commit-id-plugin-core by Konrad 'ktoso' Malawski <konrad.malawski@java.pl>
 *
 * git-commit-id-plugin-core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * git-commit-id-plugin-core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with git-commit-id-plugin-core.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.project13.core.jgit;

import org.junit.Test;
import pl.project13.core.log.StdOutLoggerBridge;

import static org.assertj.core.api.Assertions.assertThat;

public class JGitCommonTest {

  @Test
  public void trimFullTagName_shouldTrimFullTagNamePrefix() throws Exception {
    // given
    String fullName = "refs/tags/v1.0.0";

    // when
    String simpleName = new JGitCommon(new StdOutLoggerBridge(true)).trimFullTagName(fullName);

    // then
    assertThat(simpleName).isEqualTo("v1.0.0");
  }
}