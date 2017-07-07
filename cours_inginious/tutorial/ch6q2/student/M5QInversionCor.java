/**
 *  Copyright (c) 2016 Gellens Arnaud, Gonzalez Alvarez Pablo
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 
package student;

public class M5QInversionStu {

	// Code a verifier
	public static void inverse(int tab[]){
    	assert(tab!=null);
        int tmp;
        for(int i=0; i<(int)(tab.length/2);i++){
        	tmp = tab[i];
            tab[i]=tab[tab.length-i-1];
            tab[tab.length-i-1]=tmp;
        }
	}
}