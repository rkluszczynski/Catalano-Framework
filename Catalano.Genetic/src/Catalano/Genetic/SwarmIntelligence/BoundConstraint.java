// Catalano Genetic Library
// The Catalano Framework
//
// Copyright © Diego Catalano, 2012-2016
// diego.catalano at live.com
//
//
//    This library is free software; you can redistribute it and/or
//    modify it under the terms of the GNU Lesser General Public
//    License as published by the Free Software Foundation; either
//    version 2.1 of the License, or (at your option) any later version.
//
//    This library is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//    Lesser General Public License for more details.
//
//    You should have received a copy of the GNU Lesser General Public
//    License along with this library; if not, write to the Free Software
//    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
//

package Catalano.Genetic.SwarmIntelligence;

import Catalano.Core.DoubleRange;
import java.util.ArrayList;
import java.util.List;

/**
 * Bound constraint.
 * @author Diego Catalano
 */
public class BoundConstraint {
    
    private List<DoubleRange> locationRange;
    private List<DoubleRange> velocityRange;

    /**
     * Get location range.
     * @return Location range.
     */
    public List<DoubleRange> getLocationRange() {
        return locationRange;
    }

    /**
     * Set location range.
     * @param range Location range.
     */
    public void setLocationRange(List<DoubleRange> range) {
        this.locationRange = range;
    }

    /**
     * Get velocity range.
     * @return Velocity range.
     */
    public List<DoubleRange> getVelocityRange() {
        return velocityRange;
    }

    /**
     * Set velocity range.
     * @param velocityRange Velocity range.
     */
    public void setVelocityRange(List<DoubleRange> velocityRange) {
        this.velocityRange = velocityRange;
    }
    
    /**
     * Initialize a new instance of the BoundConstraint class.
     */
    public BoundConstraint(){
        this.locationRange = new ArrayList<>();
        this.velocityRange = new ArrayList<>();
    }

    /**
     * Initialize a new instance of the BoundConstraint class.
     * @param locationRange Location range.
     * @param velocityRange Velocity range.
     */
    public BoundConstraint(List<DoubleRange> locationRange, List<DoubleRange> velocityRange) {
        this.locationRange = locationRange;
        this.velocityRange = velocityRange;
    }
    
    /**
     * Add a new constraint.
     * Velocity(-1, 1).
     * @param location Location.
     */
    public void add(DoubleRange location){
        add(location, new DoubleRange(-1, 1));
    }
    
    /**
     * Add a new constraint.
     * @param location Location.
     * @param velocity Velocity.
     */
    public void add(DoubleRange location, DoubleRange velocity){
        locationRange.add(location);
        velocityRange.add(velocity);
    }
    
    /**
     * Remove a constraint.
     * @param index Index.
     */
    public void remove(int index){
        locationRange.remove(index);
        velocityRange.remove(index);
    }
    
    /**
     * Clear.
     */
    public void clear(){
        locationRange.clear();
        velocityRange.clear();
    }
    
}