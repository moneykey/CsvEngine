/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     ybonnel - initial API and implementation
 */
package fr.ybo.moteurcsv.exception;

/**
 * Exception envoyée si les paramètres des adapteurs ou des validateur sont
 * mauvais.
 */
@SuppressWarnings("serial")
public class InvalideParamException extends Exception {

	public InvalideParamException(String message) {
		super(message);
	}

	public InvalideParamException(String message, Exception exception) {
		super(message, exception);
	}
}