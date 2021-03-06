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

package Catalano.Genetic.SwarmIntelligence.PSO;

/**
 * Particle.
 * @author Diego Catalano
 */
public class Particle {
    
    private double fitness;
    private Velocity velocity;
    private Location location;

    /**
     * Get fitness value.
     * @return Fitness value.
     */
    public double getFitness() {
        return fitness;
    }

    /**
     * Set fitness value.
     * @param fitness Fitness value.
     */
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    /**
     * Get velocity.
     * @return Velocity value.
     */
    public Velocity getVelocity() {
        return velocity;
    }

    /**
     * Set velocity.
     * @param velocity Velocity.
     */
    public void setVelocity(Velocity velocity) {
        this.velocity = velocity;
    }

    /**
     * Get location.
     * @return Location value.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Set location.
     * @param location Set location value.
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Initializes a new instance of the Particle class.
     */
    public Particle() {}
    
    /**
     * Initializes a new instance of the Particle class.
     * @param location Location value.
     * @param velocity Velocity value.
     */
    public Particle(Location location, Velocity velocity) {
        this(location, velocity, 0);
    }

    /**
     * Initializes a new instance of the Particle class.
     * @param location Location value.
     * @param velocity Velocity value.
     * @param fitness Fitness value.
     */
    public Particle(Location location, Velocity velocity, double fitness) {
        this.location = location;
        this.velocity = velocity;
        this.fitness = fitness;
    }
    
}