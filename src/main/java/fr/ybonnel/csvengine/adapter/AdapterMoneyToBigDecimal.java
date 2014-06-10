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


import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;

import fr.ybonnel.csvengine.adapter.AdapterCsv;
import fr.ybonnel.csvengine.validator.ValidateException;

/**
 * Adapter for Double<br/><br/>
 * <i><u>French :</i> Adapteur pour les BigDecimal.
 *
 * @author ybonnel
 */
public class AdapterMoneyToBigDecimal extends AdapterCsv<BigDecimal> {

	private NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
    /**
     * Transform a String into BigDecimal.
     *
     * @param string the string to transform.
     * @return the BigDecimal transformed.
     * @throws ValidateException 
     * @throws ParseException 
     */
    public BigDecimal parse(String string) throws ValidateException {
    	try {
			Number x = formatter.parse(string);
			if ( x instanceof BigDecimal ) return (BigDecimal) x;
			if ( x instanceof Long ) return BigDecimal.valueOf((Long)x);
			if ( x instanceof Double) return BigDecimal.valueOf((Double)x);
			String errorMessage = "Input String: \""+ string +"\" to Big to Parse.";
			throw new ParseException(errorMessage, 0);
		} catch (ParseException e) {
			throw new ValidateException(string, e);
		}
    }

    /**
     * Transform a BigDecimal into String.
     *
     * @param object BigDecimal to transform.
     * @return the resulting string.
     */
    public String toString(BigDecimal object) {
        return object.toString();
    }
}
