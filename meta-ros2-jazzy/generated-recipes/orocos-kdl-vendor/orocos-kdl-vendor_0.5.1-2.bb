# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around orocos_kdl, providing nothing but a dependency on orocos_kdl on some systems.     On others, it fetches and builds orocos_kdl locally."
AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
HOMEPAGE = "https://github.com/orocos/orocos_kinematics_dynamics"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & LGPL-2.1-or-later"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "orocos_kdl_vendor"
ROS_BPN = "orocos_kdl_vendor"

ROS_BUILD_DEPENDS = " \
    eigen3-cmake-module \
    libeigen \
    orocos-kdl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-vendor-package-native \
"

ROS_EXPORT_DEPENDS = " \
    eigen3-cmake-module \
    libeigen \
    orocos-kdl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    eigen3-cmake-module \
    libeigen \
    orocos-kdl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/orocos_kdl_vendor-release/archive/release/jazzy/orocos_kdl_vendor/0.5.1-2.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/orocos_kdl_vendor"
SRC_URI = "git://github.com/ros2-gbp/orocos_kdl_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "adca6201616af928533d70faea6042fe0239e898"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}