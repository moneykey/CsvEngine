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
package fr.ybonnel.csvengine.adapter;

/**
 * Adapter for Integer<br/><br/>
 * <i><u>French :</i> Adapteur pour les Integer.
 * 
 * @author ybonnel
 * 
 */
public class AdapterLong extends AdapterCsv<Long> {

    /**
     * Transform a String into Long.
     *
     * @param string the string to transform.
     * @return the Integer transformed.
     */
	public Long parse(String string) {
		return Long.valueOf(string);
	}

    /**
     * Transform an Integer into String.
     *
     * @param object Integer to transform.
     * @return the resulting string.
     */
	public String toString(Long object) {
		return object.toString();
	}
}
