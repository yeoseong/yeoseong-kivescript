/*
 * Copyright (c) 2016 the original author or authors.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.korea.kivescript.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Temporary categorization of triggers while sorting.
 *
 * @author Noah Petherbridge
 * @author Marcel Overdijk
 */
public class SortTrack {
	
	//밑의 트리거들을 제외한 모든 트리거를 포함.
	private Map<Integer, List<SortedTriggerEntry>> atomic;
	//"["을 가진 트리거, 키값으로 해당 트리거가 "["을 몇개를 포함하고 있는지.
	private Map<Integer, List<SortedTriggerEntry>> option;
	//"_"을 가진 트리거, 키값으로 해당 트리거가 "_"을 몇개를 포함하고 있는지.
	private Map<Integer, List<SortedTriggerEntry>> alpha;
	//"#"을 가진 트리거, 키값으로 해당 트리거가 "#"을 몇개를 포함하고 있는지.
	private Map<Integer, List<SortedTriggerEntry>> number;
	//"*"을 가진 트리거, 키값으로 해당 트리거가 "*"을 몇개를 포함하고 있는지.
	private Map<Integer, List<SortedTriggerEntry>> wild;
	private List<SortedTriggerEntry> pound;                // Triggers of just '#'
	private List<SortedTriggerEntry> under;                // Triggers of just '_'
	private List<SortedTriggerEntry> star;                 // Triggers of just '*'

	public SortTrack() {
		this.atomic = new HashMap<>();
		this.option = new HashMap<>();
		this.alpha = new HashMap<>();
		this.number = new HashMap<>();
		this.wild = new HashMap<>();
		this.pound = new ArrayList<>();
		this.under = new ArrayList<>();
		this.star = new ArrayList<>();
	}

	public Map<Integer, List<SortedTriggerEntry>> getAtomic() {
		return atomic;
	}

	public Map<Integer, List<SortedTriggerEntry>> getOption() {
		return option;
	}

	public Map<Integer, List<SortedTriggerEntry>> getAlpha() {
		return alpha;
	}

	public Map<Integer, List<SortedTriggerEntry>> getNumber() {
		return number;
	}

	public Map<Integer, List<SortedTriggerEntry>> getWild() {
		return wild;
	}

	public List<SortedTriggerEntry> getPound() {
		return pound;
	}

	public List<SortedTriggerEntry> getUnder() {
		return under;
	}

	public List<SortedTriggerEntry> getStar() {
		return star;
	}
}
