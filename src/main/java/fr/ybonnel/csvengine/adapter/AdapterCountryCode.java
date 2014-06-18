package fr.ybonnel.csvengine.adapter;

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


import fr.ybonnel.csvengine.adapter.AdapterCsv;
import fr.ybonnel.csvengine.adapter.support.CountryCode;

/**
 * Adapter for Double<br/><br/>
 * <i><u>French :</i> Adapteur pour les BigDecimal.
 *
 * @author ybonnel
 */
public class AdapterCountryCode extends AdapterCsv<String> {


    /**
     * Transform a String into BigDecimal.
     *
     * @param string the string to transform.
     * @return the BigDecimal transformed.
     */
    public String parse(String string) {
    	CountryCode cc = CountryCode.getByCode(string);
    	if ( cc != null ) return cc.getAlpha2();
    	return string;
    }

    /**
     * Transform a BigDecimal into String.
     *
     * @param object BigDecimal to transform.
     * @return the resulting string.
     */
    public String toString(String object) {
        return object.toString();
    }
}
